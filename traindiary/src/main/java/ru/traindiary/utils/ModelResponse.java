package ru.traindiary.utils;

public class ModelResponse {

	private boolean success;
	
	private String msg;

	public ModelResponse(boolean success, String msg) {
		this.success = success;
		this.msg = msg;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "ModelResponse [success=" + success + ", msg=" + msg + "]";
	}
	
	
}
