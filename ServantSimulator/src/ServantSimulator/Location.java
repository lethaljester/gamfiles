package ServantSimulator;
import java.util.*;

//base class for each location
//extend this class for each location to be added to the compound
	//individual class for each location



public class Location {

	public Location() {
		// TODO Auto-generated constructor stub
	}
	private List<Slave> slaveList = new ArrayList<>();
	public void addSlave(Slave slave){
		slaveList.add(slave);
	}
	
	//return the list of slaves of this location
	public List<Slave> slaveList(){
		return slaveList;
	}
	
	//move slave to new location
	public void moveCar(String slaveName, Location newLocation){
		int index = -1;
		for (int i=0; i<slaveList.size(); i++){
				if (slaveList.get(i).getName().equals(slaveName)){
					index = i;
				}
		}
		if (index == -1){
			System.out.println("Cannot Find Slave");
		}else{
			newLocation.slaveList().add(slaveList.get(index));
			slaveList.remove(index);
		}
	}
}
