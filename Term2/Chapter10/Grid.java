class Grid {
	
	String stuff;
	
	public Grid(){
		ArrayList<String> x = new ArrayList<String>();
		ArrayList<String> y = new ArrayList<String>();
	}

	public void add(String description){
		x.add(description);
		y.add(description);
	}

	public String getDescription(int index){
		return x.get(index);
		return y.get(index);
	}

	public ArrayList<Location> getDescribedLocations(){
		for(int i = 0; i < x.size();i++){
			for(int j = 0; j < y.size();j++){
				if(describers[i][j] != ""){
					stuff += describers[i][j] + " ";
				}
			}
		}
	}
}