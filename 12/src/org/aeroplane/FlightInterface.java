package org.aeroplane;

import org.areoplane.Passenger;

/**
 * ����ӿ�
 * @author Asus
 */
public interface FlightInterface {
    /**
     * Ԥ��������λ
     * @param names ����ÿ��������ַ�������
     * @return ���ش��Ԥ���ŵ�����
     */
public int[] reserve(String[] names);
/**
 * ȡ��Ԥ����λ
 * @param bookingNumber �ò���ָ��Ҫȡ����Ԥ����
 * @return ���ظ���λ��Ԥ��״̬
 */
public boolean cancel(int bookingNumber);
/**
 * ��ȡԤ������λ���ÿ��б�
 * @return ���ش���ÿ�����������
 */
public Passenger[] getPassengerList();
}
