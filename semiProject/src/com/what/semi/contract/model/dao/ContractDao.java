package com.what.semi.contract.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.what.semi.common.template.JDBCTemplate;
import com.what.semi.common.template.RandomStringGenerator;
import com.what.semi.contract.model.vo.ContractVo;
import com.what.semi.recruitment.model.vo.RecruitmentVo;

public class ContractDao {

	public ArrayList<ContractVo> selectMyContractList(Connection con, String id, int currentPage, int limit) {
		ArrayList<ContractVo> list = null;
		Statement stmt = null;
		ResultSet rs = null;
		String query = "";
		int startRow = (currentPage - 1) * limit + 1; 
		int endRow = startRow +limit - 1;
		try {
			stmt = con.createStatement();
			query = "select C_NO,STATE,C_DATE,START_WORK_TIME,END_WORK_TIME,RECRUITMENT_ID,BO_ID,JS_ID,RESUME_ID,DEMANDER "
					+"FROM (SELECT ROWNUM RNUM, P.* "
					+"FROM (SELECT C_NO,STATE,C_DATE,START_WORK_TIME,END_WORK_TIME,RECRUITMENT_ID,BO_ID,JS_ID,RESUME_ID,DEMANDER "
					+"FROM CONTRACT WHERE BO_ID='"+id+"' OR JS_ID='"+id+"' "
					+"ORDER BY C_NO DESC) P) WHERE RNUM BETWEEN "+startRow+" AND "+endRow;
			 //System.out.println(query);
			rs = stmt.executeQuery(query);
			list = new ArrayList<ContractVo>();
			ContractVo cont = null;
			while (rs.next()) {
				cont = new ContractVo();
				cont.setC_no(rs.getInt("c_no"));
				cont.setState(rs.getInt("state"));
				cont.setContract_date(rs.getDate("c_date"));
				cont.setStart_work_time(rs.getString("start_work_time"));
				cont.setEnd_work_time(rs.getString("end_work_time"));
				cont.setRecruitment_id(rs.getString("recruitment_id"));
				cont.setBo_id(rs.getString("bo_id"));
				cont.setJs_id(rs.getString("js_id"));
				cont.setResume_id(rs.getInt("resume_id"));
				cont.setDemander(rs.getString("demander"));

				list.add(cont);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rs);
			JDBCTemplate.close(stmt);
		}

		return list;
	}

	public int selectMyConListTotalCount(Connection con, String id) {
		int result = -1;

		Statement stmt = null;
		ResultSet rs = null;
		String query = "";
		try {
			stmt = con.createStatement();
			query = "SELECT COUNT(*) AS LISTCOUNT " + "FROM CONTRACT " 
					+ "WHERE BO_id='" + id + "' OR JS_ID='" + id+ "' " 
					+ "ORDER BY C_DATE";
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				result = rs.getInt("listCount");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rs);
			JDBCTemplate.close(stmt);
		}

		return result;
	}

	public int updateContractState(Connection con, int contId, int state) {
		int result = -1;

		Statement stmt = null;
		String query = "";
		try {
			stmt = con.createStatement();
			query = "UPDATE CONTRACT SET STATE="+state+" WHERE C_NO="+contId;
			result = stmt.executeUpdate(query);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(stmt);
		}

		return result;
	}

	public int insertContract(Connection con, String recId, String bo_id, String js_id, int resumeId,String demander) {
		int result = -1;

		Statement stmt = null;
		String query = "";
		try {
			stmt = con.createStatement();
			query = "INSERT INTO CONTRACT VALUES (SEQ_CONTRACT.NEXTVAL,0,NULL,NULL,NULL,'"+recId+"','"+bo_id+"','"+js_id+"',"+resumeId+",'"+demander+"')";
			System.out.println(query);
			result = stmt.executeUpdate(query);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(stmt);
		}

		return result;
	}

	public ContractVo selectThisCon(Connection con, String recId, String bo_id, String js_id, int resumeId) {
		ContractVo cont = null;
		Statement stmt = null;
		ResultSet rs = null;
		String query = "";
		try {
			stmt = con.createStatement();
			query = "SELECT * "
					+"FROM CONTRACT "
					+"WHERE RECRUITMENT_ID='"+recId+"' AND BO_ID='"+bo_id+"' AND JS_ID='"+js_id+"' AND RESUME_ID="+resumeId;
			 //System.out.println(query);
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				cont = new ContractVo();
				cont.setC_no(rs.getInt("c_no"));
				cont.setState(rs.getInt("state"));
				cont.setContract_date(rs.getDate("c_date"));
				cont.setStart_work_time(rs.getString("start_work_time"));
				cont.setEnd_work_time(rs.getString("end_work_time"));
				cont.setRecruitment_id(rs.getString("recruitment_id"));
				cont.setBo_id(rs.getString("bo_id"));
				cont.setJs_id(rs.getString("js_id"));
				cont.setResume_id(rs.getInt("resume_id"));
				cont.setDemander(rs.getString("demander"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rs);
			JDBCTemplate.close(stmt);
		}

		return cont;
	}

	public ArrayList<ContractVo> selectMyAppliedList(Connection con, String recId, String js_id) {
		ArrayList<ContractVo> list = null;
		Statement stmt = null;
		ResultSet rs = null;
		String query = "";
		try {
			stmt = con.createStatement();
			query = "SELECT * "
					+"FROM CONTRACT "
					+"WHERE RECRUITMENT_ID='"+recId+"' AND JS_ID='"+js_id+"'";
			//System.out.println(query);
			rs = stmt.executeQuery(query);
			list = new ArrayList<ContractVo>();
			ContractVo cont = null;
			while (rs.next()) {
				cont = new ContractVo();
				cont.setC_no(rs.getInt("c_no"));
				cont.setState(rs.getInt("state"));
				cont.setContract_date(rs.getDate("c_date"));
				cont.setStart_work_time(rs.getString("start_work_time"));
				cont.setEnd_work_time(rs.getString("end_work_time"));
				cont.setRecruitment_id(rs.getString("recruitment_id"));
				cont.setBo_id(rs.getString("bo_id"));
				cont.setJs_id(rs.getString("js_id"));
				cont.setResume_id(rs.getInt("resume_id"));
				cont.setDemander(rs.getString("demander"));

				list.add(cont);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rs);
			JDBCTemplate.close(stmt);
		}

		return list;
	}

	public int updateExpriedContractState(Connection con) {
		int result= -1;
		Statement stmt = null;
		String query = null;
		
		try {
			stmt=con.createStatement();
			query = "UPDATE CONTRACT SET STATE=2 WHERE RECRUITMENT_ID IN (SELECT RECRUITMENT_ID FROM RECRUITMENT WHERE IS_POST=0)";
			result=stmt.executeUpdate(query);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JDBCTemplate.close(stmt);
		}
		
		return result;
	}

	public int updateContractDate(Connection con, int contId) {
		int result= -1;
		Statement stmt = null;
		String query = null;
		
		try {
			stmt=con.createStatement();
			query = "UPDATE CONTRACT SET C_DATE=SYSDATE WHERE C_NO="+contId;
			result=stmt.executeUpdate(query);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JDBCTemplate.close(stmt);
		}
		
		return result;
	}

	public ContractVo selectContract(Connection con, int c_no) {
		ContractVo cont = null;
		Statement stmt = null;
		ResultSet rs = null;
		String query = "";
		try {
			stmt = con.createStatement();
			query = "SELECT * "
					+"FROM CONTRACT "
					+"WHERE C_NO="+c_no;
			 //System.out.println(query);
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				cont = new ContractVo();
				cont.setC_no(rs.getInt("c_no"));
				cont.setState(rs.getInt("state"));
				cont.setContract_date(rs.getDate("c_date"));
				cont.setStart_work_time(rs.getString("start_work_time"));
				cont.setEnd_work_time(rs.getString("end_work_time"));
				cont.setRecruitment_id(rs.getString("recruitment_id"));
				cont.setBo_id(rs.getString("bo_id"));
				cont.setJs_id(rs.getString("js_id"));
				cont.setResume_id(rs.getInt("resume_id"));
				cont.setDemander(rs.getString("demander"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rs);
			JDBCTemplate.close(stmt);
		}

		return cont;
	}

	public int updateStartTime(Connection con, int c_no) {
		int result= -1;
		Statement stmt = null;
		String query = null;
		
		try {
			stmt=con.createStatement();
			query = "UPDATE CONTRACT SET START_WORK_TIME=SYSDATE WHERE C_NO="+c_no;
			result=stmt.executeUpdate(query);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JDBCTemplate.close(stmt);
		}
		
		return result;
	}

	public int updateEndTime(Connection con, int c_no) {
		int result= -1;
		Statement stmt = null;
		String query = null;
		
		try {
			stmt=con.createStatement();
			query = "UPDATE CONTRACT SET END_WORK_TIME=SYSDATE WHERE C_NO="+c_no;
			result=stmt.executeUpdate(query);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JDBCTemplate.close(stmt);
		}
		
		return result;
	}

	public int selectContractCurrentPage(Connection con, String js_id, int contId) {
		int result = -1;

		Statement stmt = null;
		ResultSet rs = null;
		String query = "";
		try {
			stmt = con.createStatement();
			query = "SELECT COUNT(*) AS LISTCOUNT " + "FROM CONTRACT " 
					+ "WHERE JS_ID='" + js_id+ "' AND C_NO>="+contId
					+ " ORDER BY C_NO";
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				result = rs.getInt("listCount");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rs);
			JDBCTemplate.close(stmt);
		}

		return result;
	}

	public ArrayList<ContractVo> selectmySuggestedConList(Connection con, int resumeId, String boId) {
		ArrayList<ContractVo> list = null;
		Statement stmt = null;
		ResultSet rs = null;
		String query = "";
		try {
			stmt = con.createStatement();
			query = "SELECT * "
					+"FROM CONTRACT "
					+"WHERE RESUME_ID="+resumeId+" AND BO_ID='"+boId+"'";
			//System.out.println(query);
			rs = stmt.executeQuery(query);
			list = new ArrayList<ContractVo>();
			ContractVo cont = null;
			while (rs.next()) {
				cont = new ContractVo();
				cont.setC_no(rs.getInt("c_no"));
				cont.setState(rs.getInt("state"));
				cont.setContract_date(rs.getDate("c_date"));
				cont.setStart_work_time(rs.getString("start_work_time"));
				cont.setEnd_work_time(rs.getString("end_work_time"));
				cont.setRecruitment_id(rs.getString("recruitment_id"));
				cont.setBo_id(rs.getString("bo_id"));
				cont.setJs_id(rs.getString("js_id"));
				cont.setResume_id(rs.getInt("resume_id"));
				cont.setDemander(rs.getString("demander"));

				list.add(cont);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rs);
			JDBCTemplate.close(stmt);
		}

		return list;
	}

	public String searchMemId(Connection con, String recId, String declarationId, String memberType) {
		String memId=null;
		
		PreparedStatement pstmt = null;	//SQL문을 나타내는 객체
		ResultSet rs = null;
		String query = "";
		
		try {
			if(memberType.equals("JS")) {
				query = "SELECT BO_ID FROM CONTRACT WHERE RECRUITMENT_ID = ? AND JS_ID = ?";
				pstmt = con.prepareStatement(query);
				pstmt.setString(1, recId);
				pstmt.setString(2, declarationId);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					if(rs.getString("BO_ID")!=null) {
						memId = rs.getString("BO_ID");
					}
					else {
						System.out.println("악덕 업주 아이디 찾기 실패");
					}
				}
			}else {
				query = "SELECT JS_ID FROM CONTRACT WHERE RECRUITMENT_ID = ? AND BO_ID = ?";
				pstmt = con.prepareStatement(query);
				pstmt.setString(1, recId);
				pstmt.setString(2, declarationId);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					if(rs.getString("JS_ID")!=null) {
						memId = rs.getString("JS_ID");
					}
					else {
						System.out.println("악덕 구직자 아이디 찾기 실패");
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		return memId;
	}

}
