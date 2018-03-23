### Q唐注册

demo 建表语句

create table tbl_account 
	(fld_loginid int(10) primary key not null auto_increment, 
	fld_name char(50), 
	fld_pwd char(50), 
	fld_mail varchar(45), 
	fld_mobile varchar(13), 
	fld_superpwd varchar(21), 
	fld_IdCardNo varchar(25), 
	fld_RealName varchar(25), 
	fld_btIsActivate tinyint(3), 
	fld_szAcode varchar(20), 
	fld_btGmLvl tinyint(4), 
	fld_btSex tinyint(4), 
	fld_btIsAdult tinyint(4), 
	fld_dwActivateTime int(10), 
	fld_btPrizeType int(10), 
	fld_guildid int(11), 
	fld_yuanbao int(11), 
	fld_email_verify_key int(11), 
	fld_emailverify int(11), 
	usercode char(128), 
	fld_cellphone char(128));
