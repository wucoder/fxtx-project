package com.fxtx.cloud.utils.file;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by super-man on 2016/11/14.
 */
public class Plupload {

    /**
     * 文件临时名(打文件被分解时)或原名
     */
    private String name;

    /**
     * 临时文件名称
     */
    private String temName;

    /**
     * 总的块数
     */
    private int chunks = -1;
    /**
     * 当前块数（从0开始计数）
     */
    private int chunk = -1;
    /**
     * HttpServletRequest对象，不能直接传入进来，需要手动传入
     */
    private HttpServletRequest request;
    /**
     * 保存文件上传信息，不能直接传入进来，需要手动传入
     */
    private MultipartFile multipartFile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTemName() {
        return temName;
    }

    public void setTemName(String temName) {
        this.temName = temName;
    }

    public int getChunks() {
        return chunks;
    }

    public void setChunks(int chunks) {
        this.chunks = chunks;
    }

    public int getChunk() {
        return chunk;
    }

    public void setChunk(int chunk) {
        this.chunk = chunk;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }

}
