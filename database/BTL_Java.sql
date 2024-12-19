USE master;  
ALTER DATABASE CafeManagement SET SINGLE_USER WITH ROLLBACK IMMEDIATE;
IF EXISTS (SELECT * FROM SYSDATABASES WHERE NAME = 'CafeManagement')
DROP DATABASE CafeManagement
GO

--Lệnh Bắt Đầu Từ Đây
CREATE DATABASE CafeManagement
GO
USE CafeManagement
GO
-- Bảng Staff: Lưu thông tin nhân viên
CREATE TABLE Staff (
    StaffID INT IDENTITY(1,1) PRIMARY KEY,
    FullName NVARCHAR(100) NOT NULL,
	Gender NVARCHAR(3),
	DateStaff DATE,
    PhoneNumber NVARCHAR(10),
	AddressStaff NVARCHAR(100),
	UserName NVARCHAR(20) NOT NULL UNIQUE,
	PasswordStaff NVARCHAR(20) NOT NULL,
	Email NVARCHAR(100),
    Position NVARCHAR(50) NOT NULL,
	ImageStaff IMAGE 
)
-- Bảng Customer: Lưu thông tin khách hàng
CREATE TABLE Customer (
    CustomerID INT IDENTITY(1,1) PRIMARY KEY,
    FullName NVARCHAR(100) NOT NULL,
	Gender NVARCHAR(3),
	DateStaff DATE,
    PhoneNumber NVARCHAR(10) UNIQUE,
	AddressStaff NVARCHAR(100),
	Email NVARCHAR(100)
)
-- Bảng LoaiSanPham: Lưu thông tin loại sản phẩm 
CREATE TABLE LoaiSanPham (
    MaLoaiSP NVARCHAR(50) PRIMARY KEY,
    TenLoai NVARCHAR(50),
    TrangThai NVARCHAR(20)
)
-- Bảng SanPham:Lưu thông tin sản phẩm
CREATE TABLE SanPham (
    MaSP NVARCHAR(50) PRIMARY KEY,
    TenSP NVARCHAR(50),
    Anh IMAGE,
    TrangThai NVARCHAR(20),
	MaLoaiSP NVARCHAR(50),
	CONSTRAINT FK_SP_ML FOREIGN KEY(MaLoaiSP) REFERENCES LoaiSanPham(MaLoaiSP)
)
-- Bảng ChiTietSP: Lưu thông tin chi tiết sản phẩm
CREATE TABLE ChiTietSP (
    MaCTSP NVARCHAR(50) PRIMARY KEY,
    MaSP NVARCHAR(50),
    NgayNhap DATE,
    SoLuong INT,
    Gia DECIMAL(18, 2),
    MoTa NVARCHAR(200),
    CONSTRAINT FK_CTSP_SP FOREIGN KEY(MaSP) REFERENCES SanPham(MaSP)
)
--Bảng Ban: Lưu thông tin chi tiết bàn
CREATE TABLE Ban (
    MaBan NVARCHAR(50) PRIMARY KEY,
    TenBan NVARCHAR(50),
    TrangThai NVARCHAR(20)
)
-- Bảng HoaDon: Lưu thông tin chi tiết hóa đơn
CREATE TABLE HoaDon (
    MaHD INT IDENTITY(1,1) PRIMARY KEY,
    StaffID INT,
    MaBan NVARCHAR(50),
    CustomerID INT,
    NgayTao DATE,
    TongTien DECIMAL(18, 2),
    TrangThai NVARCHAR(20),
    CONSTRAINT FK_HD_S FOREIGN KEY (StaffID) REFERENCES Staff(StaffID),
    CONSTRAINT FK_HD_B FOREIGN KEY (MaBan) REFERENCES Ban(MaBan),
    CONSTRAINT FK_HD_KH FOREIGN KEY (CustomerID) REFERENCES Customer(CustomerID)
)
-- Bảng ChiTietHoaDon: Lưu thông tin chi tiết hóa đơn
CREATE TABLE ChiTietHoaDon (
    MaHD INT,
    MaCTSP NVARCHAR(50),
    SoLuong INT,
    TongTien DECIMAL(18, 2),
    CONSTRAINT PK_CTHD PRIMARY KEY (MaHD, MaCTSP),
    CONSTRAINT FK_CTHD_HD FOREIGN KEY (MaHD) REFERENCES HoaDon(MaHD),
    CONSTRAINT FK_CTHD_CTSP FOREIGN KEY (MaCTSP) REFERENCES ChiTietSP(MaCTSP)
)
GO
--Tạo giá trị mặc định ban đầu
INSERT Staff VALUES 
(N'Tạ Văn Tiến', 'Nam', '2005-10-15','0345601751',N'Liệp Tuyết','admin','123456','tavantien786@gmail.com','admin',NULL),
(N'Kiều Minh Hiếu', 'Nam', '2005-3-17','0123456789',N'Liệp Tuyết',N'hieukichan','123456','hieukichan@gmail.com','nhan vien',NULL),
(N'Đỗ Thị Thùy', N'Nữ', '2005-4-17','0987654321',N'Thạch Thất',N'thuydo1704','123456','thuydo1704@gmail.com','nhan vien',NULL)

INSERT Customer VALUES 
(N'Kiều Minh Hiếu', 'Nam', '2005-3-17','0123456789',N'Liệp Tuyết','hieukichan@gmail.com'),
(N'Nguyễn Danh Thao', 'Nam','2005-1-1','1234567890',N'Ba Vì','thao@gmail.com')

INSERT LoaiSanPham VALUES 
('SP01',N'Nước Uống',N'Còn'),
('SP02',N'Đồ Ăn',N'Còn')

INSERT SanPham VALUES
('TS01',N'Trà Sữa Truyền Thống',NULL,N'Còn','SP01'),
('TS02',N'Trà Đào',NULL,N'Còn','SP01')

INSERT ChiTietSP VALUES
('SPCT01','TS01','2024-10-15',30,10000,NULL),
('SPCT02','TS02','2024-10-15',40,15000,NULL)

INSERT Ban VALUES 
('01',N'Bàn 1',N'Còn Trống'),
('02',N'Bàn 2',N'Còn Trống'),
('03',N'Bàn 3',N'Còn Trống'),
('04',N'Bàn 4',N'Còn Trống'),
('05',N'Bàn 5',N'Còn Trống'),
('06',N'Bàn 6',N'Còn Trống'),
('07',N'Bàn 7',N'Còn Trống'),
('08',N'Bàn 8',N'Còn Trống'),
('09',N'Bàn 9',N'Còn Trống'),
('10',N'Bàn 10',N'Còn Trống')
GO

SELECT * FROM Staff
SELECT * FROM Customer
SELECT * FROM LoaiSanPham
SELECT * FROM SanPham
SELECT * FROM ChiTietSP
SELECT * FROM Ban
SELECT * FROM HoaDon
SELECT * FROM ChiTietHoaDon


