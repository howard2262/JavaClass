
package lab05;

public class ElevatorInfo {

private int floor=1;
public final int Maxfloor=5;
public final int MinFloor=1;

public int getFloor(){
return floor;
}

public void UpFloor (){
if (floor<5) {
floor++;
}
}

public void DownFloor (){
if (floor>1) {
floor--;
}
}    
}
