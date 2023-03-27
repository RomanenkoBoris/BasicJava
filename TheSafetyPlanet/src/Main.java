public class Main {

    public static void main (String[] args){
        boolean areForestsUnderProtection = true;
        boolean areAnimalsUnderProtection = true;
        boolean areTheOceansClear = true;
        boolean isTheIndustryModern = false;
        boolean isHumanityResponsible = false;
        boolean isNuclearWarThreatExist = true;
        boolean canMankindStopGlobalWarming = false;
        boolean isThereThreatFromSpace = true;

        boolean isPlanetSafe;

        isPlanetSafe = areAnimalsUnderProtection && areForestsUnderProtection && areTheOceansClear && isTheIndustryModern
                && isHumanityResponsible && isNuclearWarThreatExist && canMankindStopGlobalWarming && isThereThreatFromSpace;
        System.out.println(isPlanetSafe);

        isPlanetSafe = areAnimalsUnderProtection && areForestsUnderProtection && areTheOceansClear && !isTheIndustryModern
                && !isHumanityResponsible && !canMankindStopGlobalWarming;
        System.out.println(isPlanetSafe);

        isPlanetSafe = isNuclearWarThreatExist || isThereThreatFromSpace;
        System.out.println(!isPlanetSafe);
        


    }
}
