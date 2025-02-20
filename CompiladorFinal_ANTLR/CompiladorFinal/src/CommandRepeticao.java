

import java.util.List;

// classe para comandos de repeticao (ENQUANTO -> while)
public class CommandRepeticao extends Command {
	private String condicao;
	private List<Command> comandos;

	public List<Command> getCorpo() {
		return comandos;
	}

	public CommandRepeticao(String condicao, List<Command> comandos) {
		this.condicao = condicao;
		this.comandos = comandos;
	}

	@Override
	public String generateCode() {
		StringBuilder str = new StringBuilder();
		str.append("while (" + condicao + ") {\n");

		for (Command cmd : comandos) {
			str.append("    " + cmd.generateCode());
		}

		str.append("}\n");
		return str.toString();
	}

}