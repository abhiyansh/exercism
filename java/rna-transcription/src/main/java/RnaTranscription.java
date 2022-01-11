class RnaTranscription {

    String transcribe(String dnaStrand) {
        dnaStrand = dnaStrand.replace('G', 'c');
        dnaStrand = dnaStrand.replace('C', 'g');
        dnaStrand = dnaStrand.replace('T', 'a');
        dnaStrand = dnaStrand.replace('A', 'u');
        return dnaStrand.toUpperCase();
    }

}
