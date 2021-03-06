package org.picon.service;

import feign.FeignException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.picon.dto.member.*;
import org.picon.dto.post.PostDto;
import org.picon.dto.statics.StatisticsDto;
import org.picon.exception.BusinessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
public class FeignPostRemoteServiceFallback implements FeignPostRemoteService {
    private final Throwable cause;

    @Override public List<PostDto> readPostsByLoginId(String identity) {
        if (cause instanceof FeignException && ((FeignException) cause).status() == 404) {
            log.error("404 error took place"
                    + ". Error message: "
                    + cause.getLocalizedMessage());
            throw new RuntimeException(cause);
        } else {
            log.error("Other error took place: " + cause.getLocalizedMessage());
            throw new BusinessException(cause);
        }
    }

    @Override public List<PostDto> readPostsById(Long id) {
        if (cause instanceof FeignException && ((FeignException) cause).status() == 404) {
            log.error("404 error took place"
                    + ". Error message: "
                    + cause.getLocalizedMessage());
            throw new RuntimeException(cause);
        } else {
            log.error("Other error took place: " + cause.getLocalizedMessage());
            throw new BusinessException(cause);
        }
    }

    @Override public PostDto createPost(PostDto post, String identity) {
        if (cause instanceof FeignException && ((FeignException) cause).status() == 404) {
            log.error("404 error took place"
                    + ". Error message: "
                    + cause.getLocalizedMessage());
            throw new RuntimeException(cause);
        } else {
            log.error("Other error took place: " + cause.getLocalizedMessage());
            throw new BusinessException(cause);
        }
    }

    @Override
    public List<String> ImagesUpload(MultipartFile[] multipartFiles) {
        if (cause instanceof FeignException && ((FeignException) cause).status() == 404) {
            log.error("404 error took place"
                    + ". Error message: "
                    + cause.getLocalizedMessage());
            throw new RuntimeException(cause);
        } else {
            log.error("Other error took place: " + cause.getLocalizedMessage());
            throw new BusinessException(cause);
        }
    }

    @Override
    public ResponseEntity deletePost(Long id, String identity) {
        if (cause instanceof FeignException && ((FeignException) cause).status() == 404) {
            log.error("404 error took place"
                    + ". Error message: "
                    + cause.getLocalizedMessage());
            throw new RuntimeException(cause);
        } else {
            log.error("Other error took place: " + cause.getLocalizedMessage());
            throw new BusinessException(cause);
        }
    }

    @Override
    public StatisticsDto getPostsByStatistics(int year, int month, String identity) {
        if (cause instanceof FeignException && ((FeignException) cause).status() == 404) {
            log.error("404 error took place"
                    + ". Error message: "
                    + cause.getLocalizedMessage());
            throw new RuntimeException(cause);
        } else {
            log.error("Other error took place: " + cause.getLocalizedMessage());
            throw new BusinessException(cause);
        }
    }

    @Override public MemberDetailDto getMember(String identity) {
        if (cause instanceof FeignException && ((FeignException) cause).status() == 404) {
            log.error("404 error took place"
                    + ". Error message: "
                    + cause.getLocalizedMessage());
            throw new RuntimeException(cause);
        } else {
            log.error("Other error took place: " + cause.getLocalizedMessage());
            throw new BusinessException(cause);
        }
    }

    @Override
    public ProfileResponse ImageUpload(MultipartFile multipartFile) {

        if (cause instanceof FeignException && ((FeignException) cause).status() == 404) {
            log.error("404 error took place"
                    + ". Error message: "
                    + cause.getLocalizedMessage());
            throw new RuntimeException(cause);
        } else {
            log.error("Other error took place: " + cause.getLocalizedMessage());
            throw new BusinessException(cause);
        }
    }

    @Override
    public MemberDto uploadProfile(String identity, ProfileRequest profileRequest) {

        if (cause instanceof FeignException && ((FeignException) cause).status() == 404) {
            log.error("404 error took place"
                    + ". Error message: "
                    + cause.getLocalizedMessage());
            throw new RuntimeException(cause);
        } else {
            log.error("Other error took place: " + cause.getLocalizedMessage());
            throw new BusinessException(cause);
        }
    }

    @Override public List<MemberDetailDto> searchMember(String identity, String input) {
        if (cause instanceof FeignException && ((FeignException) cause).status() == 404) {
            log.error("404 error took place"
                    + ". Error message: "
                    + cause.getLocalizedMessage());
            throw new RuntimeException(cause);
        } else {
            log.error("Other error took place: " + cause.getLocalizedMessage());
            throw new BusinessException(cause);
        }
    }

    @Override public void follow(String identity, Long followMemberId) {
        if (cause instanceof FeignException && ((FeignException) cause).status() == 404) {
            log.error("404 error took place"
                    + ". Error message: "
                    + cause.getLocalizedMessage());
            throw new RuntimeException(cause);
        } else {
            log.error("Other error took place: " + cause.getLocalizedMessage());
            throw new BusinessException(cause);
        }
    }

    @Override
    public void deleteProfile(String identityByToken) {
        if (cause instanceof FeignException && ((FeignException) cause).status() == 404) {
            log.error("404 error took place"
                    + ". Error message: "
                    + cause.getLocalizedMessage());
            throw new RuntimeException(cause);
        } else {
            log.error("Other error took place: " + cause.getLocalizedMessage());
            throw new BusinessException(cause);
        }
    }

    @Override public MemberSearchResponse getFollowingMembers(String identityByToken) {
        if (cause instanceof FeignException && ((FeignException) cause).status() == 404) {
            log.error("404 error took place"
                    + ". Error message: "
                    + cause.getLocalizedMessage());
            throw new RuntimeException(cause);
        } else {
            log.error("Other error took place: " + cause.getLocalizedMessage());
            throw new BusinessException(cause);
        }
    }

    @Override public MemberSearchResponse getFollowerMembers(String identityByToken) {
        if (cause instanceof FeignException && ((FeignException) cause).status() == 404) {
            log.error("404 error took place"
                    + ". Error message: "
                    + cause.getLocalizedMessage());
            throw new RuntimeException(cause);
        } else {
            log.error("Other error took place: " + cause.getLocalizedMessage());
            throw new BusinessException(cause);
        }
    }

    @Override public void unfollow(String identity, Long followMemberId) {
        if (cause instanceof FeignException && ((FeignException) cause).status() == 404) {
            log.error("404 error took place"
                    + ". Error message: "
                    + cause.getLocalizedMessage());
            throw new RuntimeException(cause);
        } else {
            log.error("Other error took place: " + cause.getLocalizedMessage());
            throw new BusinessException(cause);
        }
    }
}
