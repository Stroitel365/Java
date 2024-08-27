package sem6_hw;

import java.util.List;
import java.util.Random;

public class Laptop {

    private int ramNumber;
    private int hardDriveCapacity;
    private String sysType;

    private int[] ramNumberTypes = {4,8,16,32,64};
    private int[] hardDriveCapacityTypes = {128,256,512,1024};
    private String[] sysTypeSet = {"macOS", "Without OS",  "Linux","Windows"};
    private Random generator = new Random();



    public Laptop(String sysType, int ramNumber, int hardDriveCapacity){
       }
       
    public Laptop(){
        setRamNumber();
        setHardDriveCapacity();
        setSysType();
    }
    
    public int getRamNumber() {
        return ramNumber;
    }
    public void setRamNumber() {
        this.ramNumber = this.ramNumberTypes[generator.nextInt(5)];
    }
    public void setRamNumber(int ramNumber) {
        this.ramNumber = ramNumber;
    }
    public int getHardDriveCapacity() {
        return hardDriveCapacity;
    }
    public void setHardDriveCapacity() {
        this.hardDriveCapacity = this.hardDriveCapacityTypes[generator.nextInt(4)];
    }
    public void setHardDriveCapacity(int hardDriveCapacity) {
        this.hardDriveCapacity = hardDriveCapacity;
    }
    public String getSysType() {
        return sysType;
    }
    public void setSysType() {
        this.sysType = this.sysTypeSet[generator.nextInt(4)];
    }
    public void setSysType(String sysType) {
        this.sysType = sysType;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ramNumber;
        result = prime * result + hardDriveCapacity;
        result = prime * result + ((sysType == null) ? 0 : sysType.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (ramNumber != other.ramNumber)
            return false;
        if (hardDriveCapacity != other.hardDriveCapacity)
            return false;
        if (sysType == null) {
            if (other.sysType != null)
                return false;
        } else if (!sysType.equals(other.sysType))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Laptop [ramNumber=" + ramNumber + ", hardDriveCapacity=" + hardDriveCapacity + ", sysType=" + sysType
                + "]\n";
    }

}
