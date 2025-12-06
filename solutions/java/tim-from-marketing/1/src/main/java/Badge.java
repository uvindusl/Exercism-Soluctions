class Badge {
    public String print(Integer id, String name, String department) {
        if (id == null && department == null){
            return String.format("%s - %s", name, "OWNER");
        }
        else if (department == null){
            return String.format("[%d] - %s - %s", id, name, "OWNER");
        }
        else if (id == null){
            return String.format("%s - %s", name, department.toUpperCase());
        }
        else {
            return String.format("[%d] - %s - %s", id, name, department.toUpperCase());
        }
    }
}
