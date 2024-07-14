class Practice1{
	public static void aMethod() throws Exception {
		try{
			throw new Exception();
		}
		finally{
			System.out.println("finally");
		}
	}

	public static void main(String[] arg){
		try{
			aMethod();
		}catch(Exception e){
			System.out.println("Exception");
		}	
	}
}
