class ConcretePrototype implements Prototype {
    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    public ConcretePrototype(ConcretePrototype prototype) {
        this.name = prototype.name;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}