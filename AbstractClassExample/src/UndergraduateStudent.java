class UndergraduateStudent extends Student {
    public UndergraduateStudent(String name) {
        super(name);
    }

    @Override
    public void attendClass() {
        System.out.println(getName() + "is attending class");
    }
}
