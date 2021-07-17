class ComputerMouseTester{

public static void main(String[] args){
ComputerMouse.displayAll();
ComputerMouse.changeWireLess(true);
ComputerMouse.changeChargeable("no charge");
int range=20;
ComputerMouse.changeRange(range);
ComputerMouse.displayAll();
}
}