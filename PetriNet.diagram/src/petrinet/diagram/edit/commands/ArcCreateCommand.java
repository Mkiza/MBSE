package petrinet.diagram.edit.commands;

import yeah.*;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import petrinet.diagram.edit.policies.PetrinetBaseItemSemanticEditPolicy;
import yeah.petrinet.Arc;
import yeah.petrinet.Node;
import yeah.petrinet.PetrinetFactory;
import yeah.petrinet.petrinet;

/**
 * @generated NOT
 */
public class ArcCreateCommand extends EditElementCommand {

	/**
	* @generated NOT
	*/
	private final EObject source;

	/**
	* @generated NOT
	*/
	private final EObject target;

	/**
	* @generated NOT NOT 
	*/
	private final yeah.petrinet.petrinet container;

	/**
	* @generated NOT
	*/
	public ArcCreateCommand(CreateRelationshipRequest request, EObject source, EObject target) {
		super(request.getLabel(), null, request);
		this.source = source;
		this.target = target;
		container = deduceContainer(source, target);
	}

	/**
	* @generated NOT
	*/
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null && false == source instanceof Node) {
			return false;
		}
		if (target != null && false == target instanceof Node) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		if (getContainer() == null) {
			return false;
		}
		return PetrinetBaseItemSemanticEditPolicy.getLinkConstraints().canCreateArc_4010(getContainer(), getSource(),
				getTarget());
	}

	/**
	* @generated NOT
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in create link command"); //$NON-NLS-1$
		}

		Arc newElement = PetrinetFactory.eINSTANCE.createArc();
		getContainer().getArcs().add(newElement);
		newElement.setSource(getSource());
		newElement.setTarget(getTarget());
		doConfigure(newElement, monitor, info);
		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);

	}

	/**
	* @generated NOT
	*/
	protected void doConfigure(yeah.petrinet.Arc newElement, IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
		IElementType elementType = ((CreateElementRequest) getRequest()).getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest()).getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		configureRequest.setParameter(CreateRelationshipRequest.SOURCE, getSource());
		configureRequest.setParameter(CreateRelationshipRequest.TARGET, getTarget());
		ICommand configureCommand = elementType.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

	/**
	* @generated NOT
	*/
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}

	/**
	* @generated NOT
	*/
	protected Node getSource() {
		return (Node) source;
	}

	/**
	* @generated NOT
	*/
	protected Node getTarget() {
		return (Node) target;
	}

	/**
	* @generated NOT
	*/
	public yeah.petrinet.petrinet getContainer() {
		return container;
	}

	/**
	* Default approach is to traverse ancestors of the source to find instance of container.
	* Modify with appropriate logic.
	* @generated NOT
	*/
	private static yeah.petrinet.petrinet deduceContainer(EObject source, EObject target) {
		// Find container element for the new link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null; element = element.eContainer()) {
			if (element instanceof yeah.petrinet.petrinet) {
				return (yeah.petrinet.petrinet) element;
			}
		}
		return null;
	}

}
