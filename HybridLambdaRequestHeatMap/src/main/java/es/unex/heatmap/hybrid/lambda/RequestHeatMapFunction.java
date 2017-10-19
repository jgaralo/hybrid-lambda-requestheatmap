package es.unex.heatmap.hybrid.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import es.unex.heatmap.hybrid.messages.RequestHeatMapMessage;

public class RequestHeatMapFunction  implements RequestHandler<RequestHeatMapMessage, String>{

	public String handleRequest(RequestHeatMapMessage heatMapMessage, Context context) {
		context.getLogger().log("Request received: "+heatMapMessage.getRequestId()+" - "+heatMapMessage.getRadius()+" - "+heatMapMessage.getBeginDate());
		return "OK";
	}

}
