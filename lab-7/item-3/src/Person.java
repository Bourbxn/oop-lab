class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;
    
    public Person(String name,String address,String phoneNumber,String emailAddress){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    //setter

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }

    //getter

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getEmailAddress(){
        return emailAddress;
    }

    public String toString(){
        return "Person{name="+name+", "+
        "address="+address+", "+
        "phoneNumber="+phoneNumber+", "+
        "email="+emailAddress+"}\n";
    }

    //function
    public void renderPerson(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Phone: "+phoneNumber);
        System.out.println("Email: "+emailAddress);
    }

    public void renderPersonT(){
        System.out.println("Person");
    }

}
