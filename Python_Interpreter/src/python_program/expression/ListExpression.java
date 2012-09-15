package python_program.expression;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import python_program.Types;

public class ListExpression extends Expression {
	
	List<Expression> list;
	
	public ListExpression(List<Expression> list) {
		this.list = list;
	}
	
	@Override
	public void print() {
		System.out.print("[ ");
		
		Iterator<Expression> iterator = this.list.iterator();
		if(iterator != null) {
		if(iterator.hasNext()) {
			iterator.next().print();
		}		
		while(iterator.hasNext()) {
			System.out.print(", ");
			iterator.next().print();			
		}}
		else{
			System.out.print("NNNNUUUUUUUUUULLLLLLLLLLLLLLLLLLLLLLL");
		}
		
		System.out.print(" ]");
	}

	@Override
	public Types getType() {
		return Types.list_type;
	}

}
