class GradeConverter {
    static String convertGradeFromDanishToUS(String grade) throws Exception {
        switch (grade) {
            case "12":
                return "A";
            case "10":
                return "B";
            case "7":
                return "C";
            case "4":
                return "D";
            case "02":
            case "00":
            case "-3":
                return "F";

        }
        throw new Exception("Grade does not exist");
    }

    static String convertGradeFromUSToDanish(String grade) throws Exception {
        switch (grade) {
            case "A":
                return "12";
            case "B":
                return "10";
            case "C":
                return "7";
            case "D":
                return "4";
            case "F":
                return "00";
        }
        throw new Exception("Grade does not exist");
    }
}
