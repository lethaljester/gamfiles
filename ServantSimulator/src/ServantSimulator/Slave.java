package ServantSimulator;

public class Slave {

	public Slave() {
		// TODO Auto-generated constructor stub
		race = new Race();
	}
	private Race race;
	// stats displayed as actual intergers(not Descriptive)
	private int ageInDays, height, weight, cupSizeInCC;
	//Daily Stats displayed as text with ranges
	int beautyScore, obedienceScore, lustScore, nymphomaniaScore, tempermentScore, intelligenceScore, 
		refinementScore, fearScore, enduranceScore, energyScore, socialScore, reputationScore;
	String beautylvl, obediencelvl, lustlvl, nymphomanialvl, tempermentlvl, intelligencelvl, refinementlvl, fearlvl,
		endurancelvl, energylvl, sociallvl, reputationLvl;
	
	//Experience of the various skills that can be learned by all slaves
	//sex skills
	int blowjobScore, vaginalSexScore, analSexScore, titJobscore, bondageScore, 
	
	private String name;
	//non sexual Skills
}

/*
Descriptive intergers  and integers players can see
int age, height, weight, cupSize(in CC's),

integers that are obscured by descriptors
int beauty, obedience, lust, nymph, (independence), intelligence, elegance/refinement,
	 (weight bodtype???), fSkill, oSkill, Askill, outerSkill, fear
	 physical(endurance), Social(coversation)

	lips, behind, waist, 

location based skills
	seductionSkill, wSkill, leadership(incharge of others),
	maid(household), bondSkill, teachingSkill

kinkSkills
	add the difering ones and set maxes for all, improve when taught.
	

find out what can be taught skill wise. 


Notes to self
	all skills will be on a scale to 1000
	levels will be set on that scale to reflect it taking longer to move
	on each end of that scale.
	each change in a stat must be accompanied by a drop in another stat
	(make sure they make sense) to make it more difficult to make the
	perfect one. 
	Skill improve faster if taught by someone that already has a
	significantly greater lvl than the one being taught. 
	price will depend on 2 major factors (excluding the economy
	mechanichs)	Type of buyer, and skills related to that buyer.
	(in addition to minor controbutions by age beauty and other misc
	items)

	On creation each one will have a chance at having benifitial 
	modifiers(great dancer, good student, good with buisness) that can
	affect the rates of skill gain on those related skills
	(all this excludes modifiers by outside sources e.g. location
	teacher, etc)

	Will also have modifiers depending on clothing(if applicable)
*/