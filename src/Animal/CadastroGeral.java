package Animal;

import java.util.Date;

public class CadastroGeral {

	protected int id;
	protected String rg;
	protected Date data;
	protected String nome;
	protected String proprietario;
	protected String especie;
	protected String sexo;
	protected String raca;
	protected String idade;
	protected String responsavel;
	protected String categoria;

	protected String examesUSG;
	protected int estudosUSGSimples;
	protected int estudosUSGComplexos;

	protected String areaAtendimento;

	protected int casosNovosSimples;
	protected int casosNovosComplexos;
	protected int retornosSC;

	protected String tecnicasAnestesicas;
	protected int procedimentosASimples;
	protected int procedimentosAComplexos;

	protected String procedimentosCirurgicos;
	protected int procedimentosCSimples;
	protected int procedimentosCComplexos;

	protected String examesEndoscopia;
	protected int estudosESimples;
	protected int estudosEComplexos;

	protected String propriedade;
	protected String individual100km;
	protected String individualAcima100km;
	protected String rebanho100km;
	protected String rebanhoAcima100km;

	public CadastroGeral() {

	}

	public CadastroGeral(int id, String nome, String proprietario, String especie, String sexo, String idade, String rg,
			String responsavel, Date data, String areaAtendimento, int casosNovosSimples, int casosNovosComplexos,
			int retornosSC, String tecnicasAnestesicas, String examesEndoscopia, String examesUSG,
			int estudosEComplexos, int estudosESimples, int estudosUSGSimples, int estudosUSGComplexos,
			int procedimentosAComplexos, int procedimentosASimples, int procedimentosCComplexos,
			int procedimentosCSimples, String propriedade, String individual100km, String individualAcima100km,
			String rebanho100km, String rebanhoAcima100km, String procedimentosCirurgicos, String categoria) {

		this.id = id;
		this.nome = nome;
		this.data = data;
		this.proprietario = proprietario;
		this.especie = especie;
		this.sexo = sexo;
		this.idade = idade;
		this.rg = rg;
		this.responsavel = responsavel;
		this.areaAtendimento = areaAtendimento;
		this.casosNovosSimples = casosNovosSimples;
		this.casosNovosComplexos = casosNovosComplexos;
		this.retornosSC = retornosSC;
		this.tecnicasAnestesicas = tecnicasAnestesicas;
		this.procedimentosCirurgicos = procedimentosCirurgicos;
		this.examesUSG = examesUSG;
		this.examesEndoscopia = examesEndoscopia;
		this.estudosEComplexos = estudosEComplexos;
		this.estudosESimples = estudosESimples;
		this.estudosUSGSimples = estudosUSGSimples;
		this.estudosUSGComplexos = estudosUSGComplexos;
		this.procedimentosAComplexos = procedimentosAComplexos;
		this.procedimentosASimples = procedimentosASimples;
		this.procedimentosCComplexos = procedimentosCComplexos;
		this.procedimentosCSimples = procedimentosCSimples;
		this.propriedade = propriedade;
		this.individual100km = individual100km;
		this.individualAcima100km = individualAcima100km;
		this.rebanho100km = rebanho100km;
		this.rebanhoAcima100km = rebanhoAcima100km;
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public Date getData() {

		return data;
	}

	public String getExamesUSG() {
		return examesUSG;
	}

	public void setExamesUSG(String examesUSG) {
		this.examesUSG = examesUSG;
	}

	public int getEstudosUSGSimples() {
		return estudosUSGSimples;
	}

	public void setEstudosUSGSimples(int estudosUSGSimples) {
		this.estudosUSGSimples = estudosUSGSimples;
	}

	public int getEstudosUSGComplexos() {
		return estudosUSGComplexos;
	}

	public void setEstudosUSGComplexos(int estudosUSGComplexos) {
		this.estudosUSGComplexos = estudosUSGComplexos;
	}

	public String getAreaAtendimento() {
		return areaAtendimento;
	}

	public void setAreaAtendimento(String areaAtendimento) {
		this.areaAtendimento = areaAtendimento;
	}

	public int getCasosNovosSimples() {
		return casosNovosSimples;
	}

	public void setCasosNovosSimples(int casosNovosSimples) {
		this.casosNovosSimples = casosNovosSimples;
	}

	public int getCasosNovosComplexos() {
		return casosNovosComplexos;
	}

	public void setCasosNovosComplexos(int casosNovosComplexos) {
		this.casosNovosComplexos = casosNovosComplexos;
	}

	public int getRetornosSC() {
		return retornosSC;
	}

	public void setRetornosSC(int retornosSC) {
		this.retornosSC = retornosSC;
	}

	public String getTecnicasAnestesicas() {
		return tecnicasAnestesicas;
	}

	public void setTecnicasAnestesicas(String tecnicasAnestesicas) {
		this.tecnicasAnestesicas = tecnicasAnestesicas;
	}

	public int getProcedimentosASimples() {
		return procedimentosASimples;
	}

	public void setProcedimentosASimples(int procedimentosASimples) {
		this.procedimentosASimples = procedimentosASimples;
	}

	public int getProcedimentosAComplexos() {
		return procedimentosAComplexos;
	}

	public void setProcedimentosAComplexos(int procedimentosAComplexos) {
		this.procedimentosAComplexos = procedimentosAComplexos;
	}

	public String getProcedimentosCirurgicos() {
		return procedimentosCirurgicos;
	}

	public void setProcedimentosCirurgicos(String procedimentosCirurgicos) {
		this.procedimentosCirurgicos = procedimentosCirurgicos;
	}

	public int getProcedimentosCSimples() {
		return procedimentosCSimples;
	}

	public void setProcedimentosCSimples(int procedimentosCSimples) {
		this.procedimentosCSimples = procedimentosCSimples;
	}

	public int getProcedimentosCComplexos() {
		return procedimentosCComplexos;
	}

	public void setProcedimentosCComplexos(int procedimentosCComplexos) {
		this.procedimentosCComplexos = procedimentosCComplexos;
	}

	public String getExamesEndoscopia() {
		return examesEndoscopia;
	}

	public void setExamesEndoscopia(String examesEndoscopia) {
		this.examesEndoscopia = examesEndoscopia;
	}

	public int getEstudosESimples() {
		return estudosESimples;
	}

	public void setEstudosESimples(int estudosESimples) {
		this.estudosESimples = estudosESimples;
	}

	public int getEstudosEComplexos() {
		return estudosEComplexos;
	}

	public void setEstudosEComplexos(int estudosEComplexos) {
		this.estudosEComplexos = estudosEComplexos;
	}

	public String getPropriedade() {
		return propriedade;
	}

	public void setPropriedade(String propriedade) {
		this.propriedade = propriedade;
	}

	public String getIndividual100km() {
		return individual100km;
	}

	public void setIndividual100km(String individual100km) {
		this.individual100km = individual100km;
	}

	public String getIndividualAcima100km() {
		return individualAcima100km;
	}

	public void setIndividualAcima100km(String individualAcima100km) {
		this.individualAcima100km = individualAcima100km;
	}

	public String getRebanho100km() {
		return rebanho100km;
	}

	public void setRebanho100km(String rebanho100km) {
		this.rebanho100km = rebanho100km;
	}

	public String getRebanhoAcima100km() {
		return rebanhoAcima100km;
	}

	public void setRebanhoAcima100km(String rebanhoAcima100km) {
		this.rebanhoAcima100km = rebanhoAcima100km;
	}

}
