

public enum TerminaisonPasse {
    ai("ai"),as("as"),a("a"),ames("âmes"),ates("âtes"),erent("èrent");
    private String abg;
    TerminaisonPasse(String abrString){
        abg=abrString;
    }
    public String abreviation(){
        return this.abg;
    }
}
