import java.util.ArrayList;

public class Products {
	
	protected Integer findDifferencebetweenTwoDates(Product input) {
		LocalDate now = LocalDate.now(); // Finds the current date
	    LocalDate dateThen = LocalDate.of(input.getYear(), input.getMonth(), input.getMonth()); // Changes the date of the input into an object of LocalDate reference type
	    /* Calls the static method between in order to estimate the days passed between the two parameters given 
	     * and saves it to the variable named period 
	     */
	    Period period = Period.between(now, dateThen); 
	    return period.getDays();
	}
    	 
	ArrayList<Integer> samecode = new ArrayList<Integer>(); // contains days passed
	ArrayList<Integer> samecodeindex = new ArrayList<Integer>();
		
	 public void purchase(int code, int quantity) {
		int sum = 0;
		for (int i = 0; i < Arraylist.size() ; i++) { // arraylist of product class
			if (Arraylist.get(i).getCode().equals(code))
				samecode.add(findDate(Arraylist.get(i)));
			    samecodeindex.add(i);
			    sum = sum + Arraylist.get(i).getQuantity();
		}
		if (Quantity > sum) {
			System.out.println("Sorry!We do not have so many items of this product.");
		    return;
		} else if (samecode.size() > 1) {
			boolean sorted = false;
			while (!sorted) {
				sorted = true;
				for (int i = 0; i < samecode.size(); i++) {
					if (samecode.get(i) < samecode.get(i + 1)) {
						 int temp1 = samecode.get(i);
						 samecode.get(i) = samecode.get(i + 1);
						 samecode.get(i + 1)= temp;
				         int temp = samecodeindex(i);
				         samecodeindex(i) = samecodeindex(i + 1);
				         samecodeindex(i + 1) = temp;
				         sorted = false;
					}
				}
		    }
			for (int i = 0; i < samecode.size(); i++) {
				quantity(quantity);
			}
		} else {
			quantity(quantity);
		}
	}
	
	 public void quantity(int quantity) {
		if (quantity < Arraylist.get(samecodeindex(i)).getQuantity())
			Arraylist.get(samecodeindex(i)).setQuantity(Arraylist.get(samecodeindex(i)).getQuantity() - quantity);
		else if (quantity == Arraylist.get(samecodeindex(i)).getQuantity())
			Arraylist.remove(samecodeindex(i));
		else {
		    quantity = quantity - Arraylist.get(samecodeindex(i)).getQuantity();
		    Arraylist.remove(samecodeindex(i));
	    }
	}
}
