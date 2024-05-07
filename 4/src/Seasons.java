public enum Seasons {
    WINTER(-10),
    SUMMER(25) {
        public String getDescription() {
            return "Тёплое время года";
        }
    },
    AUTUMN(6),
    SPRING(8);
    private int avgTemp;
    Seasons(int average_temp) {
        this.avgTemp = average_temp;
    }
    public int Get_temp() {
        return avgTemp;
    }

    public String getDescription() {
        return "Холодное время года";
    }



}


