package com.imooc.sell.VO;

import lombok.Data;

@Data
public class ResultVo<T> {


    private Integer code;

    private String message;

    private T data;


}
