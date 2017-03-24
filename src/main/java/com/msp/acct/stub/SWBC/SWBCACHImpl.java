package com.msp.acct.stub.SWBC;

import com.swbc.*;
import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

import javax.jws.WebMethod;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;

/**
 * Created by markc1914 on 3/24/17.
 */
@Component("swbcACH")
public class SWBCACHImpl implements ACHTransactionSoap {

    private static final String NAMESPACE_URI = "http://www.swbc.com/";


    /**
     * Post a Single ACH transaction. Returns ACHTransResponse Class
     *
     * @param amount
     * @param convenienceFee
     * @param transDate
     * @param transType
     * @param aba
     * @param accountNumber
     * @param trxCode
     * @param individualName
     * @param originType
     * @param entityID
     * @param trxDesc
     * @param customerID
     * @param noticeLanguage
     * @param emailSendTo
     * @param emailCopyTo
     * @param emailBlindCopyTo
     * @param letterAddress
     * @param letterAddress2
     * @param letterCity
     * @param letterState
     * @param letterZip
     * @return returns com.swbc.ACHTransResponse
     */
    @Override
    @WebMethod
    public ACHTransResponse postSinglePayment(@RequestPayload double amount, @RequestPayload double convenienceFee, @RequestPayload XMLGregorianCalendar transDate, @RequestPayload String transType, @RequestPayload String aba, @RequestPayload String accountNumber, @RequestPayload String trxCode, String individualName, String originType, String entityID, String trxDesc, String customerID, String noticeLanguage, String emailSendTo, String emailCopyTo, String emailBlindCopyTo, String letterAddress, String letterAddress2, String letterCity, String letterState, String letterZip) {
        return null;
    }

    /**
     * Post a Single ACH transaction with apply to info. Returns ACHTransResponse Class
     *
     * @param parameters
     * @return returns com.swbc.PostSinglePaymentWithApplyToResponse
     */
    @Override
    public PostSinglePaymentWithApplyToResponse postSinglePayment(PostSinglePaymentWithApplyTo parameters) {
        PostSinglePaymentWithApplyToResponse response = new PostSinglePaymentWithApplyToResponse();
        ACHTransResponse achTransResponse = new ACHTransResponse();
        achTransResponse.setResponseCode("OK");
        achTransResponse.setResponseCode("TEST MESSAGE");
        achTransResponse.setResponseStringRaw("Raw Response message");
        response.setPostSinglePaymentWithApplyToResult(achTransResponse);
        return response;

    }

    /**
     * Post a Single ACH transaction with PayToABANumber. Returns ACHTransResponse Class
     *
     * @param parameters
     * @return returns com.swbc.PostSinglePaymentWithPayToABANumberResponse
     */
    @Override
    public PostSinglePaymentWithPayToABANumberResponse postSinglePayment(PostSinglePaymentWithPayToABANumber parameters) {
        return null;
    }

    /**
     * Post a Recurring ACH transaction. Returns ACHTransResponse Class
     *
     * @param amount
     * @param convenienceFee
     * @param transDate
     * @param transType
     * @param aba
     * @param accountNumber
     * @param trxCode
     * @param individualName
     * @param originType
     * @param entityID
     * @param recurrType
     * @param recurrValue1
     * @param recurrValue2
     * @param recurrValue3
     * @param numOccurrences
     * @param runBeforeDay
     * @param endDate
     * @param finalAmount
     * @param transDescription
     * @param individualIDNumber
     * @return returns com.swbc.ACHTransResponse
     */
    @Override
    public ACHTransResponse postRecurringPayment(double amount, double convenienceFee, XMLGregorianCalendar transDate, String transType, String aba, String accountNumber, String trxCode, String individualName, String originType, String entityID, String recurrType, String recurrValue1, String recurrValue2, String recurrValue3, int numOccurrences, String runBeforeDay, XMLGregorianCalendar endDate, double finalAmount, String transDescription, String individualIDNumber) {
        return null;
    }

    /**
     * Verify the ABA Routing Number. Returns Boolean Value.
     *
     * @param abaNumber
     * @return returns boolean
     */
    @Override
    public boolean validateABANumber(String abaNumber) {
        return false;
    }

    /**
     * Auto Complete ABA Number. Returns String Array.
     *
     * @param abaPart
     * @param amountToReturn
     * @return returns com.swbc.ArrayOfString
     */
    @Override
    public ArrayOfString getABACompletionList(String abaPart, int amountToReturn) {
        return null;
    }

    /**
     * Get the status of a Transaction. Returns String.
     *
     * @param trackingNumber
     * @return returns java.lang.String
     */
    @Override
    public String getStatusUpdate(String trackingNumber) {
        return null;
    }

    /**
     * Get the status of a list of Transactions. Returns String Array.
     *
     * @param trackingNumberList
     * @return returns com.swbc.ArrayOfString
     */
    @Override
    public ArrayOfString getStatusUpdateForList(ArrayOfString trackingNumberList) {
        return null;
    }

    /**
     * Dummy Function. Testing Only
     *
     * @return returns boolean
     */
    @Override
    public boolean testF5Function() {
        return false;
    }
}
