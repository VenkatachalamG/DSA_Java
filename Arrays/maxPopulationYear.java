package Arrays;

public class maxPopulationYear {
    public static void main(String[] args) {
        int[][] arr = {
                {1950,1961},
                {1960,1971},
                {1970,1981}
        };

        int ans = maximumPopulation(arr);
        System.out.println(ans);
    }
    static int maximumPopulation(int[][] logs) {
        int minYear = 1950, maxYear = 2050;
        int[] populationYears = new int[maxYear - minYear + 1];

        for (int[] years : logs){
            int birthYear = years[0] - minYear;
            int deathYear = years[1] - minYear;

            populationYears[birthYear] += 1;
            populationYears[deathYear] -= 1;
        }

        int max = populationYears[0], currentPopulation = 0, early = minYear;

        for (int year = 0; year < populationYears.length; year++){
            currentPopulation += populationYears[year];
            if (currentPopulation > max){
                max = currentPopulation;
                early = year + minYear;
            }
        }
        return early;
    }
}
