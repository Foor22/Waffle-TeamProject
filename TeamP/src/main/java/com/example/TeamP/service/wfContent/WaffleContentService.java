package com.example.TeamP.service.wfContent;

import java.util.List;

import com.example.TeamP.model.wfContent.dto.WaffleCommentDTO;
import com.example.TeamP.model.wfContent.dto.WaffleContentDTO;

public interface WaffleContentService {

	public List<WaffleContentDTO> list_reco();
	public List<WaffleContentDTO> list_all();
	
	public WaffleContentDTO detailCont(String title);
	public void admin_edit(WaffleContentDTO dto);
	public void admin_delete_re(String title);
	public void admin_delete(String title);
	public void admin_insert(WaffleContentDTO dto);
	
	public List<WaffleCommentDTO> comment_list(String title);
	public void comment_add(WaffleCommentDTO dto);
	public void comment_dlt(WaffleCommentDTO dto);
	
	public List<WaffleContentDTO> movie();
	public List<WaffleContentDTO> movie_action();
	public List<WaffleContentDTO> movie_thriller();
	public List<WaffleContentDTO> movie_romance();
	public List<WaffleContentDTO> movie_comedy();
	public List<WaffleContentDTO> movie_sf();
	
	public List<WaffleContentDTO> drama();
	public List<WaffleContentDTO> drama_action();
	public List<WaffleContentDTO> drama_thriller();
	public List<WaffleContentDTO> drama_romance();
	public List<WaffleContentDTO> drama_comedy();
	public List<WaffleContentDTO> drama_sf();
	
	public int countContent(String title, String userid);
	public List<WaffleContentDTO> search(List<String> inputArr);
}
