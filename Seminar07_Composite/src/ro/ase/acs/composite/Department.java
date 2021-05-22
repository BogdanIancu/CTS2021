package ro.ase.acs.composite;

import java.util.HashSet;
import java.util.Set;

//COMPOSITE
public class Department implements CompanyHierarchicalNode {
    private Set<CompanyHierarchicalNode> set = new HashSet<>();
    private String name;
    
    @Override
    public float getSalary() {
        float sum = 0;
        for (CompanyHierarchicalNode node : set) {
            sum += node.getSalary();
        }
        return sum;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void addHierarchicalNode(CompanyHierarchicalNode node) {
        set.add(node);
    }

    @Override
    public void deleteHierarchicalNode(CompanyHierarchicalNode node) {
        set.remove(node);
    }

    @Override
    public CompanyHierarchicalNode searchNodeByName(String name) {
        return set.stream().filter(n -> n.getName()
        		.equals(name)).findFirst().get();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(name + " Department: ");
        for (CompanyHierarchicalNode node : set) {
            stringBuilder.append(node.toString());
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
