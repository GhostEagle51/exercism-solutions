class Badge {
    public String print(Integer id, String name, String department) {
        String deptPart = (department == null) ? "OWNER" : department.toUpperCase();
        if (id == null) {
            return name + " - " + deptPart;
        }
        return "[" + id + "] - " + name + " - " + deptPart;

        
    }
}
