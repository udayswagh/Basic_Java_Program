package in.codeblog.cmsapp.exception;

public class AuthenticationUserException  extends Exception{
	
	AuthenticationUserException(){
		super();
		
	}
	public AuthenticationUserException(String errMsg){
		super(errMsg);
	}

}
