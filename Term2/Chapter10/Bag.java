class Bag {
	int count;
	
	private ArrayList<Item> bag = new ArrayList<Item>();
	
	public void add(String itemName){
		bag.add(itemName);
	}
	
	public int count(String itemName){
		count = 0;
		for(int i = 0, i< bag.size(),i++){
			if(bag.get(i) == itemName){
				count++
			}
		}
		return count;
	}
}