package ro.ase.acs.composite;

//LEAF
public class Employee implements CompanyHierarchicalNode {
    private float salary;
    private String name;

    @Override
    public float getSalary() {
        return salary;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void addHierarchicalNode(CompanyHierarchicalNode node) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteHierarchicalNode(CompanyHierarchicalNode node) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return name;
    }
}
