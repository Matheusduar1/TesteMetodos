package characters;

public class Classes extends Skills {
    private String classe;

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    @Override
    public String descricao() {
        return super.descricao() + " -> Classes";
    }
}