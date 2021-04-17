package ro.ase.acs.composite;

public interface CompanyHierarchicalNode {
	public float getSalary();
    public String getName();
    public void addHierarchicalNode(CompanyHierarchicalNode node);
    public void deleteHierarchicalNode(CompanyHierarchicalNode node);

    default public CompanyHierarchicalNode searchNodeByName(String name) {
        throw new UnsupportedOperationException();
    }
}
