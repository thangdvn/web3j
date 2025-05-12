/*
 * Copyright 2021 Web3 Labs Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.web3j.protocol.core.methods.response;

import org.web3j.crypto.TransactionUtils;
import org.web3j.utils.Numeric;

import java.math.BigInteger;

public class AuthorizationObject {
  private String chainId;
  private String nonce;
  private String address;
  private String yParity;
  private String r;
  private String s;

  public AuthorizationObject() {
  }

  public AuthorizationObject(String chainId, String nonce, String address, String yParity, String r, String s) {
    this.chainId = chainId;
    this.nonce = nonce;
    this.address = address;
    this.yParity = yParity;
    this.r = r;
    this.s = s;
  }

  public Long getChainId() {
    if (chainId != null) {
      return Numeric.decodeQuantity(chainId).longValue();
    }

    return TransactionUtils.deriveChainId(Long.parseLong(yParity));
  }

  public void setChainId(String chainId) {
    this.chainId = chainId;
  }


  public BigInteger getNonce() {
    return Numeric.decodeQuantity(nonce);
  }

  public void setNonce(String nonce) {
    this.nonce = nonce;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getyParity() {
    return yParity;
  }

  public void setyParity(String yParity) {
    this.yParity = yParity;
  }

  public String getR() {
    return r;
  }

  public void setR(String r) {
    this.r = r;
  }

  public String getS() {
    return s;
  }

  public void getS(String s) {
    this.s = s;
  }
}
