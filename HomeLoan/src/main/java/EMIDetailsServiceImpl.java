import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.model.EMIDetails;
import com.bank.repo.EMIDetailsRepo;
import com.bank.serviceI.EMIDetailsServiceI;








@Service
public class EMIDetailsServiceImpl implements EMIDetailsServiceI {
	
	
	
	@Autowired
	EMIDetailsRepo edr;

	@Override
	public EMIDetails saveEMIDetails(EMIDetails ed) {
		
		EMIDetails emi = edr.save(ed);
		
		return emi;
	}

	@Override
	public Iterable<EMIDetails> getAllEMIDetails() {
		Iterable<EMIDetails> list = edr.findAll();
		
		return list;
	}

	@Override
	public EMIDetails updateEMIDetails(Integer emiID, EMIDetails ed) {
		
		ed.setEmiId(emiID);
		EMIDetails emii = edr.save(ed);
		return emii;
	}

	@Override
	public EMIDetails getSingleEMIDetails(Integer emiID) {
		
//		Optional<EMIDetails> findById = edr.findById(emiID);
//		EMIDetails emiDetails = findById.get();
		
				return edr.findById(emiID).get();
	}

	
	@Override
	public void deleteEMIDetails(Integer emiID) {
		edr.deleteById(emiID);
		
	}

}
