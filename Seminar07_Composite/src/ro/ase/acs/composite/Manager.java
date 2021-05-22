package ro.ase.acs.composite;

import java.util.ArrayList;
import java.util.List;

//COMPOSITE
public class Manager implements CompanyHierarchicalNode{
	private static int depth = 0;
    private float salary;
    private String name;
    private List<CompanyHierarchicalNode> list = new ArrayList<>();

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
        list.add(node);
    }

    @Override
    public void deleteHierarchicalNode(CompanyHierarchicalNode node) {
        list.remove(node);
    }

    @Override
    public CompanyHierarchicalNode searchNodeByName(String name) {
        for (CompanyHierarchicalNode node : list) {
            if(node.getName().equals(name)) {
                return node;
            }
        }
        return null;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(name);
        stringBuilder.append(System.lineSeparator());
        depth++;
        for (CompanyHierarchicalNode node : list) {
            for(int i = 0; i < depth; i++) {
            	stringBuilder.append("\t");
            }
            stringBuilder.append("- ");
            stringBuilder.append(node.toString());
            stringBuilder.append(System.lineSeparator());
        }
        depth--;
        return stringBuilder.toString();
    }
}
