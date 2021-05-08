create function LayMaTuyenPhuHop(@tramDi nvarchar(50), @tramDen nvarchar(50))
returns table 
as
return select maTuyen from TuyenDiQuaTram
where tenTram in (@tramDi, @tramDen)
group by maTuyen
having count(*) = 2

select  * from LayMaTuyenPhuHop('da nang', 'ha noi') 

--> ham xac dinh no dang di hay ve de tinh thoi gian tung tram

alter function xacDinhLoaiTuyen(@maTuyen nvarchar(50), @tramDi nvarchar(50), @tramDen nvarchar(50))
returns nvarchar(50)
as
begin
	declare @thoiGianTramDi int
	declare @thoiGianTramDen int
	select @thoiGianTramDi = thoiGianDen from TuyenDiQuaTram where tenTram = @tramDi and maTuyen=@maTuyen
	select @thoiGianTramDen = thoiGianDen from TuyenDiQuaTram where tenTram = @tramDen and maTuyen=@maTuyen
	if(@thoiGianTramDi < @thoiGianTramDen) 
		begin 
			return 'di'
		end
	return 've'
	
end

select dbo.xacDinhLoaiTuyen('sghn','ha noi','tra vinh')
--> xác định thời gian di chuyển của 1 tuyến
create function loTrinhChuyen(@maChuyen nvarchar(50))
returns int --> đơn vị là giờ
as 
begin
	declare @loTrinh int
	select @loTrinh =  max(thoiGianDen) from TuyenDiQuaTram, Chuyen where
	Chuyen.maTuyen = TuyenDiQuaTram.maTuyen
	return @loTrinh
end
select dbo.loTrinhChuyen('chuyen1')
--> xác định thời gian đến trạm dựa vào mã chuyến và loại tuyến là đi hay về
alter function xacDinhThoiGianDenTram(@maChuyen nvarchar(50), @ngayDi datetime, @tenTram nvarchar(50), @loaiTuyen nvarchar(50))
returns datetime
as 
begin
	declare @thoiGianDenTram int
	declare @loTrinhTuyen int
	select @thoiGianDenTram = thoiGianDen from Chuyen, TuyenDiQuaTram 
	where Chuyen.maTuyen = TuyenDiQuaTram.maTuyen
	and tenTram = @tenTram
	set @loTrinhTuyen = dbo.loTrinhChuyen(@maChuyen)
	if(@loaiTuyen = 'di')
	begin
		return dateadd(hour, @thoiGianDenTram, @ngayDi)
	end
	return dateadd(hour, @loTrinhTuyen - @thoiGianDenTram, @ngayDi)

end

select dbo.xacDinhThoiGianDenTram('chuyen1','2021-5-8 6:00:00', 'da nang', 've')
select convert(date,getdate())
create function test() returns table
as 
return select * from Tram