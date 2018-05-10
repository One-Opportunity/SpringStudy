package kr.co.jwo.popup.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.jwo.popup.dao.IPopupDAO;
import kr.co.jwo.popup.dto.PopupDTO;
import kr.co.jwo.popup.service.IPopupService;

@Service
public class PopupServiceImpl implements IPopupService{

	@Autowired IPopupDAO popupDAO = null;
	
	@Override
	public void write(PopupDTO popupDTO) {
		popupDAO.insert(popupDTO);
	}

	@Override
	public List<PopupDTO> list() {
		return popupDAO.selectList();
	}

	@Override
	public PopupDTO view(Integer popId) {
		return popupDAO.selectOne(popId);
	}

	@Override
	public void remove(Integer popId) {
		popupDAO.delete(popId);
	}

	@Override
	public void edit(PopupDTO popupDTO) {
		popupDAO.update(popupDTO);
	}

}
