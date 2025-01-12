abstract class Student {
    private String name;

    public Student(String name){
        this.name = name;
    }

    //abstract method for attending class
    public abstract void attendClass();

    //getter for name
    public String getName(){
        return this.name;
    }

    //setter for name
    public void setName(String name){
        this.name = name;
    }

}

