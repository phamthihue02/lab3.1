package bài 3.1;

public nhập  java . sử dụng . Máy quét ;

 kiểm tra lớp  công khai {
	public  static  void  main ( String [] args ) {
		Máy quét  sc = Máy quét mới  ( Hệ thống . in );
		số  nguyên ;
		làm {
		Hệ thống . ra . println ( "Nhap vao so luong cuon sach: " );
		n = sc . nextInt ();} while ( n <= 0 );
		SACH [] a = SACH mới  [ n ];
		for ( int  i = 0 ; i < a . length ; i ++) {
			Hệ thống . ra . println ( "Nhap cuon sach thu: " +( i + 1 ));
			a [ i ]= new  SACH ();
			một [ tôi ]. NHAPSACH ();
		}
		cho ( SACH  x : a ) {
			x . INSACH ();
			Hệ thống . ra . in ( " \n " );
		}
		
	}
} {
    
}
