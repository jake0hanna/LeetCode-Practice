class ParkingSystem {
//1603

    int smallSpaces, medSpaces, bigSpaces;

    public ParkingSystem(int big, int medium, int small) {
        smallSpaces = small;
        medSpaces = medium;
        bigSpaces = big;

    }
    
    public boolean addCar(int carType) {
        switch(carType)
        {
            case 1:
                if(bigSpaces > 0)
                {
                    bigSpaces--;
                    return true;
                }
                    return false;
            
            case 2:
                if(medSpaces > 0)
                {
                    medSpaces--;
                    return true;
                }
                    return false;
        
            case 3:
                if(smallSpaces > 0)
                {
                    smallSpaces--;
                    return true;
                }
                    return false;

            default: return false;

        }
        
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */