public class Gene {
    private String dna;
    private int geneCount;

    public Gene(String d){
        dna = d;
        geneCount = 0;
    }
    
    public static int findStopCodon(String genome, int start){
        for (int i = start; i < genome.length()-2; i+=3){
            if (genome.substring(i,i+3).equals("TAA") || genome.substring(i,i+3).equals("TAG") || genome.substring(i,i+3).equals("TGA")){
                return i;
            }
        }
	    return -1;
    }

    public static int countNucleotides(String g, char nucleotide){
        int count = 0;
        for (int i = 0; i < g.length(); i++){
            if (g.charAt(i) == nucleotide){
                count++;
            }
        }
        return count; 
    }

    public static void main(String [] args){
        System.out.println(findStopCodon("ATGCATAGCGCATAG",0));
    }

    public boolean potentialGene(String g){
        // use StopCodon
        // should ATG

        return false;
    }
}
