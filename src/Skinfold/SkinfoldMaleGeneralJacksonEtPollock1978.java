package Skinfold;

public class SkinfoldMaleGeneralJacksonEtPollock1978 extends SkinfoldMaleGeneral{
	
	double density; // densidade
	
	 public double Male_18A61years () {

        density = (1.112 - 0.00043499) * (getChestMeasure() + getAM() + getTR() + getSB() + getAB() + getSI() + getCX()) + ((0.0000055 * Math.pow(getChestMeasure() + getAM() + getTR() + getSB() + getAB() + getSI() + getCX(), 2)) - 0.00028826) * (getAgeInYears());
        
        return density;
    }
	 
	 public double CalculateFatPercentage(int age, int gender) {

			double fatPercentage = 0; // percentual de gordura

			if (age >= 7 && age <= 8 && gender == 1) {

				fatPercentage = (538 / density) - 497;

			} else if (age >= 9 && age <= 10 && gender == 1) {

				fatPercentage = (530 / density) - 489;

			} else if (age >= 11 && age <= 12 && gender == 1) {

				fatPercentage = (523 / density) - 481;

			} else if (age >= 13 && age <= 14 && gender == 1) {

				fatPercentage = (507 / density) - 464;

			} else if (age >= 15 && age <= 16 && gender == 1) {

				fatPercentage = (503 / density) - 459;

			} else if (age >= 17 && age <= 19 && gender == 1) {

				fatPercentage = (498 / density) - 453;

			} else if (age >= 20 && age <= 50 && gender == 1) {

				fatPercentage = (495 / density) - 450;

			} else if (age >= 7 && age <= 8 && gender == 2) {

				fatPercentage = (543 / density) - 503;

			} else if (age >= 9 && age <= 10 && gender == 2) {

				fatPercentage = (535 / density) - 495;

			} else if (age >= 11 && age <= 12 && gender == 2) {

				fatPercentage = (525 / density) - 484;

			} else if (age >= 13 && age <= 14 && gender == 2) {

				fatPercentage = (512 / density) - 469;

			} else if (age >= 15 && age <= 16 && gender == 2) {

				fatPercentage = (507 / density) - 464;

			} else if (age >= 17 && age <= 19 && gender == 2) {

				fatPercentage = (505 / density) - 462;

			} else if (age >= 20 && age <= 50 && gender == 2) {

				fatPercentage = (503 / density) - 459;
			}

			return fatPercentage;
		}

}
