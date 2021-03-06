package petrinet.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import yeah.petrinet.Arc;
import yeah.petrinet.Node;
import yeah.petrinet.PetrinetPackage;
import yeah.petrinet.Place;
import yeah.petrinet.Token;
import yeah.petrinet.Transition;
import petrinet.diagram.edit.parts.ArcEditPart;
import petrinet.diagram.edit.parts.PetrinetEditPart;
import petrinet.diagram.edit.parts.PlaceEditPart;
import petrinet.diagram.edit.parts.TokenEditPart;
import petrinet.diagram.edit.parts.TransitionEditPart;
import petrinet.diagram.providers.PetrinetElementTypes;

/**
 * @generated
 */
public class PetrinetDiagramUpdater {

	/**
	* @generated
	*/
	public static List<PetrinetNodeDescriptor> getSemanticChildren(View view) {
		switch (PetrinetVisualIDRegistry.getVisualID(view)) {
		case PetrinetEditPart.VISUAL_ID:
			return getPetrinet_1000SemanticChildren(view);
		case PlaceEditPart.VISUAL_ID:
			return getPlace_2003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PetrinetNodeDescriptor> getPetrinet_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		yeah.petrinet.petrinet modelElement = (yeah.petrinet.petrinet) view.getElement();
		LinkedList<PetrinetNodeDescriptor> result = new LinkedList<PetrinetNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			yeah.petrinet.Node childElement = (yeah.petrinet.Node) it.next();
			int visualID = PetrinetVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == TransitionEditPart.VISUAL_ID) {
				result.add(new PetrinetNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PlaceEditPart.VISUAL_ID) {
				result.add(new PetrinetNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PetrinetNodeDescriptor> getPlace_2003SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		yeah.petrinet.Place modelElement = (yeah.petrinet.Place) view.getElement();
		LinkedList<PetrinetNodeDescriptor> result = new LinkedList<PetrinetNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTokens().iterator(); it.hasNext();) {
			yeah.petrinet.Token childElement = (yeah.petrinet.Token) it.next();
			int visualID = PetrinetVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == TokenEditPart.VISUAL_ID) {
				result.add(new PetrinetNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PetrinetLinkDescriptor> getContainedLinks(View view) {
		switch (PetrinetVisualIDRegistry.getVisualID(view)) {
		case PetrinetEditPart.VISUAL_ID:
			return getPetrinet_1000ContainedLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_2002ContainedLinks(view);
		case PlaceEditPart.VISUAL_ID:
			return getPlace_2003ContainedLinks(view);
		case TokenEditPart.VISUAL_ID:
			return getToken_3001ContainedLinks(view);
		case ArcEditPart.VISUAL_ID:
			return getArc_4010ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PetrinetLinkDescriptor> getIncomingLinks(View view) {
		switch (PetrinetVisualIDRegistry.getVisualID(view)) {
		case TransitionEditPart.VISUAL_ID:
			return getTransition_2002IncomingLinks(view);
		case PlaceEditPart.VISUAL_ID:
			return getPlace_2003IncomingLinks(view);
		case TokenEditPart.VISUAL_ID:
			return getToken_3001IncomingLinks(view);
		case ArcEditPart.VISUAL_ID:
			return getArc_4010IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PetrinetLinkDescriptor> getOutgoingLinks(View view) {
		switch (PetrinetVisualIDRegistry.getVisualID(view)) {
		case TransitionEditPart.VISUAL_ID:
			return getTransition_2002OutgoingLinks(view);
		case PlaceEditPart.VISUAL_ID:
			return getPlace_2003OutgoingLinks(view);
		case TokenEditPart.VISUAL_ID:
			return getToken_3001OutgoingLinks(view);
		case ArcEditPart.VISUAL_ID:
			return getArc_4010OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetrinetLinkDescriptor> getPetrinet_1000ContainedLinks(View view) {
		yeah.petrinet.petrinet modelElement = (yeah.petrinet.petrinet) view.getElement();
		LinkedList<PetrinetLinkDescriptor> result = new LinkedList<PetrinetLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Arc_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PetrinetLinkDescriptor> getTransition_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetrinetLinkDescriptor> getPlace_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetrinetLinkDescriptor> getToken_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetrinetLinkDescriptor> getArc_4010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetrinetLinkDescriptor> getTransition_2002IncomingLinks(View view) {
		yeah.petrinet.Transition modelElement = (yeah.petrinet.Transition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PetrinetLinkDescriptor> result = new LinkedList<PetrinetLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Arc_4010(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PetrinetLinkDescriptor> getPlace_2003IncomingLinks(View view) {
		yeah.petrinet.Place modelElement = (yeah.petrinet.Place) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PetrinetLinkDescriptor> result = new LinkedList<PetrinetLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Arc_4010(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PetrinetLinkDescriptor> getToken_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetrinetLinkDescriptor> getArc_4010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetrinetLinkDescriptor> getTransition_2002OutgoingLinks(View view) {
		yeah.petrinet.Transition modelElement = (yeah.petrinet.Transition) view.getElement();
		LinkedList<PetrinetLinkDescriptor> result = new LinkedList<PetrinetLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Arc_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PetrinetLinkDescriptor> getPlace_2003OutgoingLinks(View view) {
		yeah.petrinet.Place modelElement = (yeah.petrinet.Place) view.getElement();
		LinkedList<PetrinetLinkDescriptor> result = new LinkedList<PetrinetLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Arc_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PetrinetLinkDescriptor> getToken_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PetrinetLinkDescriptor> getArc_4010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<PetrinetLinkDescriptor> getContainedTypeModelFacetLinks_Arc_4010(
			yeah.petrinet.petrinet container) {
		LinkedList<PetrinetLinkDescriptor> result = new LinkedList<PetrinetLinkDescriptor>();
		for (Iterator<?> links = container.getArcs().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof yeah.petrinet.Arc) {
				continue;
			}
			yeah.petrinet.Arc link = (yeah.petrinet.Arc) linkObject;
			if (ArcEditPart.VISUAL_ID != PetrinetVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			yeah.petrinet.Node dst = link.getTarget();
			yeah.petrinet.Node src = link.getSource();
			result.add(
					new PetrinetLinkDescriptor(src, dst, link, PetrinetElementTypes.Arc_4010, ArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PetrinetLinkDescriptor> getIncomingTypeModelFacetLinks_Arc_4010(yeah.petrinet.Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PetrinetLinkDescriptor> result = new LinkedList<PetrinetLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != yeah.petrinet.PetrinetPackage.eINSTANCE.getArc_Target()
					|| false == setting.getEObject() instanceof yeah.petrinet.Arc) {
				continue;
			}
			yeah.petrinet.Arc link = (yeah.petrinet.Arc) setting.getEObject();
			if (ArcEditPart.VISUAL_ID != PetrinetVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			yeah.petrinet.Node src = link.getSource();
			result.add(new PetrinetLinkDescriptor(src, target, link, PetrinetElementTypes.Arc_4010,
					ArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PetrinetLinkDescriptor> getOutgoingTypeModelFacetLinks_Arc_4010(yeah.petrinet.Node source) {
		yeah.petrinet.petrinet container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof yeah.petrinet.petrinet) {
				container = (yeah.petrinet.petrinet) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<PetrinetLinkDescriptor> result = new LinkedList<PetrinetLinkDescriptor>();
		for (Iterator<?> links = container.getArcs().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof yeah.petrinet.Arc) {
				continue;
			}
			yeah.petrinet.Arc link = (yeah.petrinet.Arc) linkObject;
			if (ArcEditPart.VISUAL_ID != PetrinetVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			yeah.petrinet.Node dst = link.getTarget();
			yeah.petrinet.Node src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(
					new PetrinetLinkDescriptor(src, dst, link, PetrinetElementTypes.Arc_4010, ArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<PetrinetNodeDescriptor> getSemanticChildren(View view) {
			return PetrinetDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<PetrinetLinkDescriptor> getContainedLinks(View view) {
			return PetrinetDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<PetrinetLinkDescriptor> getIncomingLinks(View view) {
			return PetrinetDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<PetrinetLinkDescriptor> getOutgoingLinks(View view) {
			return PetrinetDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
