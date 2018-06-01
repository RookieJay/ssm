package com.car.converter;

import java.util.ArrayList;
import java.util.List;

import com.car.form.PassageForm;
import com.car.po.Passage;


public class PassageConverter {

	//将Passage转化成form
	public static PassageForm toPassageForm(Passage passage){
		PassageForm PassageForm = new PassageForm();
		Integer psId = passage.getPsId();
		String opName = passage.getOpName();
		PassageForm.setPsId(psId.toString());
		PassageForm.setOpName(opName);
		PassageForm.setPsTitle(passage.getPsTitle());
		PassageForm.setPsImg(passage.getPsImg());
		PassageForm.setPsContent(passage.getPsContent());
		return PassageForm;
	}
	//将Passages转化成forms
	public static List<PassageForm> toPassageForms(List<Passage> Passages){
		PassageForm PassageForm  = new PassageForm();
		//Passage Passage = new Passage();
		List<PassageForm> PassageForms = new ArrayList<PassageForm>();
		for(Passage Passage:Passages){
			PassageForm = toPassageForm(Passage);
			PassageForms.add(PassageForm);
		}
		return PassageForms;
	}
	
	//form->Passage
	public static Passage toPassage(PassageForm passageForm){
		Passage Passage  = new Passage();
		Passage.setPsId(Integer.valueOf(passageForm.getPsId()));
		Passage.setOpName(passageForm.getOpName());
		Passage.setPsImg(passageForm.psImg);
		Passage.setPsTitle(passageForm.getPsTitle());
		Passage.setPsContent(passageForm.getPsContent());
		return Passage;
	}
	
	//forms->Passages
	public static List<Passage> toPassages(List<PassageForm> passageForms){
		Passage Passage  = new Passage();
		//Passage Passage = new Passage();
		List<Passage> Passages = new ArrayList<Passage>();
		for(PassageForm PassageForm:passageForms){
			Passage = toPassage(PassageForm);
			Passages.add(Passage);
		}
		return Passages;
	}
	
	
	
}