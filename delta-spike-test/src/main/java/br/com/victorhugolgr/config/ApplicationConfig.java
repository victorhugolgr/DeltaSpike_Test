package br.com.victorhugolgr.config;

import javax.faces.application.ProjectStage;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class ApplicationConfig {

	@Inject
	private ProjectStage projectStage;

	// Demonstra como retornar o Project Stage atual
	public ProjectStage getProjectStage() {
		return projectStage;
	}

	// Demonstra como comparar se o ProjectStage atual é o desenvolvimento
	public boolean isDesenvolvimento() {
		return ProjectStage.Development.equals(this.projectStage);
	}

}
