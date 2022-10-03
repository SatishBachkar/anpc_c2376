package question1.exception;

class InvalidNameException extends Exception{
	
    String name;
    public InvalidNameException(String name){
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name + " " + "is invalid name";
    }
}